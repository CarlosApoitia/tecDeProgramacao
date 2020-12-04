package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MediaMes;
import com.example.demo.model.IsoietaMedia;
import com.example.demo.model.enuns.Mes;
import com.example.demo.repository.MediaProducaoRepository;

@Service
public class MediaProducaoService {

    private final MediaProducaoRepository mediaProducaoRepository;
    private final IsoietaMediaService isoietaMediaService;

    @Autowired
    public MediaProducaoService(MediaProducaoRepository mediaProducaoRepository, IsoietaMediaService isoietaMediaService) {
        this.mediaProducaoRepository = mediaProducaoRepository;
        this.isoietaMediaService = isoietaMediaService;
    }

    /**
     * Busca a media de producao por Mes.
     *
     * @return lista de media por mes
     */
    public List<MediaMes> mediaProducaoMes() {
        List<MediaMes> list = new ArrayList<>();
        List<IsoietaMedia> isoietaMedias = isoietaMediaService.listarTodos();

        for (Object[] media : this.mediaProducaoRepository.listMediaMes()) {
            MediaMes mediaMes = new MediaMes();
            mediaMes.setMes(Mes.getById(Integer.parseInt((String) media[0])));
            mediaMes.setMediaTotal(BigDecimal.valueOf((Double) media[1]));
            mediaMes.setIsoietaMedias(this.isoietaMediaService.isoietaMediaPorMes(isoietaMedias, mediaMes.getMes()));

            list.add(mediaMes);
        }

        list.addAll(this.mesesIsoietaSemProducao(list, isoietaMedias));

        return list;
    }

    /**
     * Filtra meses que possuem media de isoieta mas sem media de producao
     *
     * @param mediaMes lista de producao media
     * @param isoietaMedias lista de isoieta media
     * @return lista de media por mes
     */
    private List<MediaMes> mesesIsoietaSemProducao(List<MediaMes> mediaMes, List<IsoietaMedia> isoietaMedias) {
        List<IsoietaMedia> list = isoietaMedias.stream().filter(
                x -> mediaMes.stream().noneMatch(m -> m.getMes().getNum().equals(x.getMes()))
        ).collect(Collectors.toList());

        List<MediaMes> mediaMesList = new ArrayList<>();
        for (IsoietaMedia isoietaMedia : list) {
            MediaMes mMes = new MediaMes();
            mMes.setMes(Mes.getById(isoietaMedia.getMes()));
            mMes.setIsoietaMedias(this.isoietaMediaService.isoietaMediaPorMes(list, mMes.getMes()));

            mediaMesList.add(mMes);
        }

        return mediaMesList;
    }
}

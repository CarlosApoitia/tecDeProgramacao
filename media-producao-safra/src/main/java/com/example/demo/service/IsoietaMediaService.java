package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.IsoietaMedia;
import com.example.demo.model.enuns.Mes;
import com.example.demo.repository.IsoietaMediaRepository;

@Service
public class IsoietaMediaService {

    private final IsoietaMediaRepository isoietaMediaRepository;

    @Autowired
    public IsoietaMediaService(IsoietaMediaRepository isoietaMediaRepository) {
        this.isoietaMediaRepository = isoietaMediaRepository;
    }

    /**
     * Busca todas medias de {@link IsoietaMedia}
     * @return lista de {@link IsoietaMedia}
     */
    public List<IsoietaMedia> listarTodos() {
        return isoietaMediaRepository.findAll();
    }

    /**
     * Filtra uma lista de {@link IsoietaMedia} por {@link Mes}
     *
     * @param isoietaMedias lista de medias de isoieta
     * @param mes a ser filtrado
     * @return lista de {@link IsoietaMedia}
     */
    public List<IsoietaMedia> isoietaMediaPorMes(List<IsoietaMedia> isoietaMedias, Mes mes) {
        return isoietaMedias.stream().filter(
                x -> x.getMes().equals(mes.getNum())
        ).collect(Collectors.toList());
    }
}

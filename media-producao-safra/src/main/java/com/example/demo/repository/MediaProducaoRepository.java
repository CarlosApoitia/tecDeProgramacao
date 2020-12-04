package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MediaProducao;

@Repository
public interface MediaProducaoRepository extends JpaRepositoryImplementation<MediaProducao, Long> {

    @Query(value = "select mes, soma / total_produto as media_total " +
            "from (select mp.calendario_safra_id                              as mes, " +
            "             count(produto_id)                                   as total_produto, " +
            "             sum(cast(media_producao_fator as double precision)) as soma " +
            "      from bases.tb_media_producao mp " +
            "      group by mp.calendario_safra_id " +
            "      order by mp.calendario_safra_id) as MediaProducao " +
            "order by mes asc", nativeQuery = true)
    List<Object[]> listMediaMes();
}

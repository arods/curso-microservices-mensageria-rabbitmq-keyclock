package io.github.cursodsousa.mscartoes.infra.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursodsousa.mscartoes.domain.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long>{
    List<Cartao> findByRendaLessThanEqual(BigDecimal renda);
}

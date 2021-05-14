package br.com.systemsgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.systemsgs.model.ModelInfoFornecedor;

@Repository
public interface InfoRepository extends JpaRepository<ModelInfoFornecedor, Long>{

	ModelInfoFornecedor findByEstado(String estado);
	
}

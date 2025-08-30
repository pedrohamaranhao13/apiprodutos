package br.com.cotiinformatica.entites;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {

	private UUID id;
	private String nome;
	private BigDecimal preco;
	private Integer quantidade;
	private LocalDateTime dataHoraCriacao;
	private Boolean ativo;
	private Categoria categoria;
	
}

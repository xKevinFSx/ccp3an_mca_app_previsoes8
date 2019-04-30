package br.usjt.tempo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_diaSemana")
public class DiaSemana {

	@Id
	public String diaSemana;
}

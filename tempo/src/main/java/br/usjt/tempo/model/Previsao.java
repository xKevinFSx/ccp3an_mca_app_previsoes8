package br.usjt.tempo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "tb_previsao")
public class Previsao {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private Double temperaturaMinima;
	private Double temperaturaMaxima;
	private Double humidade;
	
	@OneToOne
	private DiaSemana diaSemana;
	
	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;
	
	@Column(nullable = true)
	private String latitude;
	
	@Column(nullable = true)
	private String longitude;
	
	@OneToMany
	private Cidade cidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(Double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public Double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(Double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public Double getHumidade() {
		return humidade;
	}
	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}

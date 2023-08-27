package br.com.system.clinica.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PacientesDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String idade;
	private String sexo;
	private String data;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cirurgia;
	private String medico;
	private String has;
	private String asmaBronquica;
	private String alergia;
	private String medicamentoUso;
	private String diabetesMellitus;
	private String dpoc;
	private String tabagismo;
	private String intercorrenciaAnestesica;
	private String estadoGeral;
	private String ar;
	private String acv;
	private String ta;
	private String exameHemartologico;
	private String eletrocardiograma;
	private String indicedeGoldmanRisco1;
	private String indicedeGoldmanRisco2;
	private String indicedeGoldmanRisco3;
	private String indicedeGoldmanRisco4;
	private String TabelaAsa;
	private String TabelaNyha;
	private String CirurgiaRisco;
	private String pacientesApto;

	public PacientesDTO() {
	}

	public PacientesDTO(Long id, String nome, String idade, String sexo, String data, String endereco, String bairro,
			String cidade, String uf, String cirurgia, String medico, String has, String asmaBronquica, String alergia,
			String medicamentoUso, String diabetesMellitus, String dpoc, String tabagismo,
			String intercorrenciaAnestesica, String estadoGeral, String ar, String acv, String ta,
			String exameHemartologico, String eletrocardiograma, String indicedeGoldmanRisco1,
			String indicedeGoldmanRisco2, String indicedeGoldmanRisco3, String indicedeGoldmanRisco4, String tabelaAsa,
			String tabelaNyha, String cirurgiaRisco, String pacientesApto) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.data = data;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cirurgia = cirurgia;
		this.medico = medico;
		this.has = has;
		this.asmaBronquica = asmaBronquica;
		this.alergia = alergia;
		this.medicamentoUso = medicamentoUso;
		this.diabetesMellitus = diabetesMellitus;
		this.dpoc = dpoc;
		this.tabagismo = tabagismo;
		this.intercorrenciaAnestesica = intercorrenciaAnestesica;
		this.estadoGeral = estadoGeral;
		this.ar = ar;
		this.acv = acv;
		this.ta = ta;
		this.exameHemartologico = exameHemartologico;
		this.eletrocardiograma = eletrocardiograma;
		this.indicedeGoldmanRisco1 = indicedeGoldmanRisco1;
		this.indicedeGoldmanRisco2 = indicedeGoldmanRisco2;
		this.indicedeGoldmanRisco3 = indicedeGoldmanRisco3;
		this.indicedeGoldmanRisco4 = indicedeGoldmanRisco4;
		this.TabelaAsa = tabelaAsa;
		this.TabelaNyha = tabelaNyha;
		this.CirurgiaRisco = cirurgiaRisco;
		this.pacientesApto = pacientesApto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(String cirurgia) {
		this.cirurgia = cirurgia;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getHas() {
		return has;
	}

	public void setHas(String has) {
		this.has = has;
	}

	public String getAsmaBronquica() {
		return asmaBronquica;
	}

	public void setAsmaBronquica(String asmaBronquica) {
		this.asmaBronquica = asmaBronquica;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getMedicamentoUso() {
		return medicamentoUso;
	}

	public void setMedicamentoUso(String medicamentoUso) {
		this.medicamentoUso = medicamentoUso;
	}

	public String getDiabetesMellitus() {
		return diabetesMellitus;
	}

	public void setDiabetesMellitus(String diabetesMellitus) {
		this.diabetesMellitus = diabetesMellitus;
	}

	public String getDpoc() {
		return dpoc;
	}

	public void setDpoc(String dpoc) {
		this.dpoc = dpoc;
	}

	public String getTabagismo() {
		return tabagismo;
	}

	public void setTabagismo(String tabagismo) {
		this.tabagismo = tabagismo;
	}

	public String getIntercorrenciaAnestesica() {
		return intercorrenciaAnestesica;
	}

	public void setIntercorrenciaAnestesica(String intercorrenciaAnestesica) {
		this.intercorrenciaAnestesica = intercorrenciaAnestesica;
	}

	public String getEstadoGeral() {
		return estadoGeral;
	}

	public void setEstadoGeral(String estadoGeral) {
		this.estadoGeral = estadoGeral;
	}

	public String getAr() {
		return ar;
	}

	public void setAr(String ar) {
		this.ar = ar;
	}

	public String getAcv() {
		return acv;
	}

	public void setAcv(String acv) {
		this.acv = acv;
	}

	public String getTa() {
		return ta;
	}

	public void setTa(String ta) {
		this.ta = ta;
	}

	public String getExameHemartologico() {
		return exameHemartologico;
	}

	public void setExameHemartologico(String exameHemartologico) {
		this.exameHemartologico = exameHemartologico;
	}

	public String getEletrocardiograma() {
		return eletrocardiograma;
	}

	public void setEletrocardiograma(String eletrocardiograma) {
		this.eletrocardiograma = eletrocardiograma;
	}

	public String getIndicedeGoldmanRisco1() {
		return indicedeGoldmanRisco1;
	}

	public void setIndicedeGoldmanRisco1(String indicedeGoldmanRisco1) {
		this.indicedeGoldmanRisco1 = indicedeGoldmanRisco1;
	}

	public String getIndicedeGoldmanRisco2() {
		return indicedeGoldmanRisco2;
	}

	public void setIndicedeGoldmanRisco2(String indicedeGoldmanRisco2) {
		this.indicedeGoldmanRisco2 = indicedeGoldmanRisco2;
	}

	public String getIndicedeGoldmanRisco3() {
		return indicedeGoldmanRisco3;
	}

	public void setIndicedeGoldmanRisco3(String indicedeGoldmanRisco3) {
		this.indicedeGoldmanRisco3 = indicedeGoldmanRisco3;
	}

	public String getIndicedeGoldmanRisco4() {
		return indicedeGoldmanRisco4;
	}

	public void setIndicedeGoldmanRisco4(String indicedeGoldmanRisco4) {
		this.indicedeGoldmanRisco4 = indicedeGoldmanRisco4;
	}

	public String getTabelaAsa() {
		return TabelaAsa;
	}

	public void setTabelaAsa(String tabelaAsa) {
		TabelaAsa = tabelaAsa;
	}

	public String getTabelaNyha() {
		return TabelaNyha;
	}

	public void setTabelaNyha(String tabelaNyha) {
		TabelaNyha = tabelaNyha;
	}

	public String getCirurgiaRisco() {
		return CirurgiaRisco;
	}

	public void setCirurgiaRisco(String cirurgiaRisco) {
		CirurgiaRisco = cirurgiaRisco;
	}

	public String getPacientesApto() {
		return pacientesApto;
	}

	public void setPacientesApto(String pacientesApto) {
		this.pacientesApto = pacientesApto;
	}

}

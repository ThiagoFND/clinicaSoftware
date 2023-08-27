package br.com.system.clinica.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Pacientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome", length = 20, nullable = true)
	private String nome;
	@Column(name = "idade", length = 20, nullable = true)
	private String idade;
	@Column(name = "sexo", length = 20, nullable = true)
	private String sexo;
	@Column(name = "data", length = 20, nullable = true)
	private String data;
	@Column(name = "endereco", length = 20, nullable = true)
	private String endereco;
	@Column(name = "bairro", length = 20, nullable = true)
	private String bairro;
	@Column(name = "cidade", length = 20, nullable = true)
	private String cidade;
	@Column(name = "uf", length = 20, nullable = true)
	private String uf;
	@Column(name = "cirurgia", length = 20, nullable = true)
	private String cirurgia;
	@Column(name = "medico", length = 20, nullable = true)
	private String medico;
	@Column(name = "has", length = 20, nullable = true)
	private String has;
	@Column(name = "asmaBronquica", length = 20, nullable = true)
	private String asmaBronquica;
	@Column(name = "alergia", length = 20, nullable = true)
	private String alergia;
	@Column(name = "medicamentoUso", length = 20, nullable = true)
	private String medicamentoUso;
	@Column(name = "diabetesMellitus", length = 20, nullable = true)
	private String diabetesMellitus;
	@Column(name = "dpoc", length = 20, nullable = true)
	private String dpoc;
	@Column(name = "tabagismo", length = 20, nullable = true)
	private String tabagismo;
	@Column(name = "intercorrenciaAnestesica", length = 20, nullable = true)
	private String intercorrenciaAnestesica;
	@Column(name = "estadoGeral", length = 20, nullable = true)
	private String estadoGeral;
	@Column(name = "ar", length = 20, nullable = true)
	private String ar;
	@Column(name = "acv", length = 20, nullable = true)
	private String acv;
	@Column(name = "ta", length = 20, nullable = true)
	private String ta;
	@Column(name = "exameHemartologico", length = 20, nullable = true)
	private String exameHemartologico;
	@Column(name = "eletrocardiograma", length = 20, nullable = true)
	private String eletrocardiograma;
	@Column(name = "indicedeGoldmanRisco1", length = 20, nullable = true)
	private String indicedeGoldmanRisco1;
	@Column(name = "indicedeGoldmanRisco2", length = 20, nullable = true)
	private String indicedeGoldmanRisco2;
	@Column(name = "indicedeGoldmanRisco3", length = 20, nullable = true)
	private String indicedeGoldmanRisco3;
	@Column(name = "indicedeGoldmanRisco4", length = 20, nullable = true)
	private String indicedeGoldmanRisco4;
	@Column(name = "TabelaAsa", length = 20, nullable = true)
	private String TabelaAsa;
	@Column(name = "TabelaNyha", length = 20, nullable = true)
	private String TabelaNyha;
	@Column(name = "CirurgiaRisco", length = 20, nullable = true)
	private String CirurgiaRisco;
	@Column(name = "pacientesApto", length = 20, nullable = true)
	private String pacientesApto;

	public Pacientes() {
	}

	public Pacientes(String nome, String idade, String sexo, String data, String endereco, String bairro, String cidade,
			String uf, String cirurgia, String medico, String has, String asmaBronquica, String alergia,
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

	@Override
	public int hashCode() {
		return Objects.hash(CirurgiaRisco, TabelaAsa, TabelaNyha, acv, alergia, ar, asmaBronquica, bairro, cidade,
				cirurgia, data, diabetesMellitus, dpoc, eletrocardiograma, endereco, estadoGeral, exameHemartologico,
				has, id, idade, indicedeGoldmanRisco1, indicedeGoldmanRisco2, indicedeGoldmanRisco3,
				indicedeGoldmanRisco4, intercorrenciaAnestesica, medicamentoUso, medico, nome, pacientesApto, sexo, ta,
				tabagismo, uf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacientes other = (Pacientes) obj;
		return Objects.equals(CirurgiaRisco, other.CirurgiaRisco) && Objects.equals(TabelaAsa, other.TabelaAsa)
				&& Objects.equals(TabelaNyha, other.TabelaNyha) && Objects.equals(acv, other.acv)
				&& Objects.equals(alergia, other.alergia) && Objects.equals(ar, other.ar)
				&& Objects.equals(asmaBronquica, other.asmaBronquica) && Objects.equals(bairro, other.bairro)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(cirurgia, other.cirurgia)
				&& Objects.equals(data, other.data) && Objects.equals(diabetesMellitus, other.diabetesMellitus)
				&& Objects.equals(dpoc, other.dpoc) && Objects.equals(eletrocardiograma, other.eletrocardiograma)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(estadoGeral, other.estadoGeral)
				&& Objects.equals(exameHemartologico, other.exameHemartologico) && Objects.equals(has, other.has)
				&& Objects.equals(id, other.id) && Objects.equals(idade, other.idade)
				&& Objects.equals(indicedeGoldmanRisco1, other.indicedeGoldmanRisco1)
				&& Objects.equals(indicedeGoldmanRisco2, other.indicedeGoldmanRisco2)
				&& Objects.equals(indicedeGoldmanRisco3, other.indicedeGoldmanRisco3)
				&& Objects.equals(indicedeGoldmanRisco4, other.indicedeGoldmanRisco4)
				&& Objects.equals(intercorrenciaAnestesica, other.intercorrenciaAnestesica)
				&& Objects.equals(medicamentoUso, other.medicamentoUso) && Objects.equals(medico, other.medico)
				&& Objects.equals(nome, other.nome) && Objects.equals(pacientesApto, other.pacientesApto)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(ta, other.ta)
				&& Objects.equals(tabagismo, other.tabagismo) && Objects.equals(uf, other.uf);
	}

}

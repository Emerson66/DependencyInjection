package model;

public class Paciente {
	private String nome;
	private String cpf;
	private String whatsapp;
	private String email;
	
	public Paciente(String nome, String cpf, String whatsapp, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.whatsapp = whatsapp;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

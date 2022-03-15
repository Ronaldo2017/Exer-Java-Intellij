package entities;

import java.util.Objects;

public class Usuario {

	private Integer numero;

	public Usuario(){

	}

	public Usuario(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Usuario usuario = (Usuario) o;
		return Objects.equals(numero, usuario.numero);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
}

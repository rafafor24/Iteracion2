package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Restaurante {

////Atributos

	/**
	 * Id del restaurante
	 */
	@JsonProperty(value="id")
	private Long id;
	
	/**
	 * Nombre del restaurante
	 */
	@JsonProperty(value="name")
	private String nombre;

	/**
	 * Representante del restaurante
	 */
	@JsonProperty(value="representante")
	private String representante;
	
	/**
	 * Tipo de comida del restaurante
	 */
	@JsonProperty(value="tipoComida")
	private String tipoComida;
	
	/**
	 * Pagina web del restaurante
	 */
	@JsonProperty(value="paginaWeb")
	private String paginaWeb;
	
	/**
	 * Metodo constructor de la clase Restaurante
	 * <b>post: </b> Crea el Restaurante con los valores que entran como parametro
	 * @param id - Id del Restaurante.
	 * @param nombre - Nombre del Restaurante.
	 * @param representante - Representante del Restaurante.
	 * @param tipoComida - Tipo de comida del Restaurante.
	 * @param paginaWeb - PaginaWeb del Restaurante.
	 */
	public Restaurante(@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre,@JsonProperty(value="representante")String representante,@JsonProperty(value="tipoComida")String tipoComida,@JsonProperty(value="paginaWeb")String paginaWeb) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.representante = representante;
		this.tipoComida = tipoComida;
		this.paginaWeb = paginaWeb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	
	
}

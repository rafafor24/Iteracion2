package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Ingrediente {

////Atributos

	/**
	 * Id del ingrediente
	 */
	@JsonProperty(value="id")
	private Long id;
	
	/**
	 * Nombre del ingrediente
	 */
	@JsonProperty(value="name")
	private String name;

	/**
	 * Descripcion del ingrediente
	 */
	@JsonProperty(value="descripcion")
	private String descripcion;
	
	/**
	 * Traduccion
	 */
	@JsonProperty(value="traduccion")
	private String traduccion;
	
	
	/**
	 * Metodo constructor de la clase video
	 * <b>post: </b> Crea el video con los valores que entran como parametro
	 * @param id - Id del video.
	 * @param name - Nombre del video. name != null
	 * @param duration - Duracion en minutos del video.
	 */
	public Ingrediente(@JsonProperty(value="id")Long id, @JsonProperty(value="name")String name,@JsonProperty(value="descripcion")String descripcion,@JsonProperty(value="traduccion")String traduccion) {
		super();
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.traduccion = traduccion;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTraduccion() {
		return traduccion;
	}

	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

}

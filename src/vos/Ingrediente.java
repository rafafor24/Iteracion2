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
	private String nombre;

	/**
	 * Descripcion del ingrediente
	 */
	@JsonProperty(value="descripcion")
	private String descripcion;
	
	/**
	 * Traduccion del ingrediente
	 */
	@JsonProperty(value="traduccion")
	private String traduccion;
	
	
	/**
	 * Metodo constructor de la clase Ingrediente
	 * <b>post: </b> Crea el Ingrediente con los valores que entran como parametro
	 * @param id - Id del Ingrediente.
	 * @param nombre - Nombre del Ingrediente.
	 * @param descripcion - Descripcion del Ingrediente.
	 * @param traduccion - Traduccion del Ingrediente.
	 */
	public Ingrediente(@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre,@JsonProperty(value="descripcion")String descripcion,@JsonProperty(value="traduccion")String traduccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.traduccion = traduccion;
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

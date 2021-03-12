package com.example.pruebaspotify.Pojo;

public class CategoriaVO {

    private String titulo;
    private String descripcion;
    private String tituloPrecio;
    private String precio;
    private String imagen;

    public CategoriaVO(String titulo, String descripcion, String tituloPrecio, String precio, String imagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tituloPrecio = tituloPrecio;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTituloPrecio() {
        return tituloPrecio;
    }

    public void setTituloPrecio(String tituloPrecio) {
        this.tituloPrecio = tituloPrecio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setIamgen(String imagen) {
        this.imagen = imagen;
    }
}

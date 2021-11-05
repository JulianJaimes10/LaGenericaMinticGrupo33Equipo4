package com.lagenerica.model;

public class Producto {

	//Atributos
	private int codigoProducto;
	private String nombreProducto;
	private int nitProveedor;
	private long precioCompra;
	private float iva = (float) 0.19;
	private long precioVenta;
	
	//Constructor vacío
	public Producto() {
		
	}

	//Constructor con parámetros
	public Producto(int codigoProducto, String nombreProducto, int nitProveedor, long precioCompra, float iva,
			long precioVenta) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.nitProveedor = nitProveedor;
		this.precioCompra = precioCompra;
		this.iva = iva;
		this.precioVenta = precioVenta;
	}

	//Métodos get y set
	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getNitProveedor() {
		return nitProveedor;
	}

	public void setNitProveedor(int nitProveedor) {
		this.nitProveedor = nitProveedor;
	}

	public long getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(long precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public long getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(long precioVenta) {
		this.precioVenta = precioVenta;
	}	
	
}

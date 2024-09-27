package com.ejercicio2.ejercicio2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "computador")

public class Computador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "procesador", length = 50)
    private String procesador;

    @Column(name = "gpu", length = 50)
    private String gpu;

    @Column(name = "cantidad_ram")
    private Integer cantidad_ram;

    @Column(name = "cantidad_espacio")
    private Integer cantidad_espacio;

    public Computador(){

    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    public void setGpu(String gpu){
        this.gpu = gpu;
    }
    public void setCantidad_ram(Integer cantidad_ram){
        this.cantidad_ram = cantidad_ram;
    }
    public void setEspacio(Integer cantidad_espacio){
        this.cantidad_espacio = cantidad_espacio;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getProcesador(){
        return this.procesador;
    }
    public String getGpu(){
        return this.gpu;
    }
    public Integer getCantidad_ram(){
        return this.cantidad_ram;
    }
    public Integer getCantidad_espacio(){
        return this.cantidad_espacio;
    }
}

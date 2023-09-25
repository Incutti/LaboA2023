package IntercambioObjetos;

import Enums.Color;

public abstract class Ropa {
    private Color color;
    private Material material;
    private String marca;
    private Boolean tieneRoturas;
    private Boolean tieneManchas;


    public Ropa(Color color, Material material, String marca, Boolean tieneRoturas, Boolean tieneManchas) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.tieneRoturas = tieneRoturas;
        this.tieneManchas = tieneManchas;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getTieneRoturas() {
        return tieneRoturas;
    }

    public void setTieneRoturas(Boolean tieneRoturas) {
        this.tieneRoturas = tieneRoturas;
    }

    public Boolean getTieneManchas() {
        return tieneManchas;
    }

    public void setTieneManchas(Boolean tieneManchas) {
        this.tieneManchas = tieneManchas;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "color=" + color +
                ", material=" + material +
                ", marca='" + marca + '\'' +
                ", tieneRoturas=" + tieneRoturas +
                ", tieneManchas=" + tieneManchas +
                '}';
    }
}

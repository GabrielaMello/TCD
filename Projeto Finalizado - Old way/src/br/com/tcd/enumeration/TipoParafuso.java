/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcd.enumeration;

/**
 *
 * @author Gabriela Mello
 */
public enum TipoParafuso {

	ESCOLHA_TIPO_PARAFUSO("Escolha o Tipo de Parafuso", 0d, 0d,0d),
	M10("M10", 10.0, 58.0, 1.9078),
	M12("M12", 12.0, 84.3, 1.7391),
	M16("M16", 16.0, 157.0, 1.5166),
	M20("M20", 20.0, 245.0, 1.3866),
	M22("M22", 22.0, 303.0, 1.3338),
	M24("M24", 24.0, 353.0, 1.2963),
	M27("M27", 27.0, 459.0, 1.25),
	M30("M30", 30.0, 561.0, 1.2125),
	M33("M33", 33.0, 694.0, 1.1805),
	M36("M36", 36.0, 817.0, 1.1567);
	
	private String nome;
	private Double DiametroParafuso;
	private Double AreaParafuso;
        private Double Alfa;

	private TipoParafuso(String nome, Double DiametroParafuso, Double AreaParafuso, Double Alfa) {
		this.nome = nome;
		this.DiametroParafuso = DiametroParafuso;
		this.AreaParafuso = AreaParafuso;
                this.Alfa = Alfa;

	}

	public Double getDiametro() {
		return this.DiametroParafuso;
	}

	public Double getArea() {
		return this.AreaParafuso;
	}

	public String getNome() {
		return nome;
	}
        
        public Double getAlfa(){
            return Alfa;
        }

	@Override
	public String toString() {
		return this.nome;
	}

}

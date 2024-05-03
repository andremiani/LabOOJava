package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materia;

/**
 * Classe que representa um Caderno, qual é uma especialização de um produto da
 * loja.
 * 
 * @author thiago leite
 */
public class Caderno extends Produto {

    /**
     * Nome do Caderno.
     */
    private String nome;

    /**
     * Gênero do Caderno.
     */
    private Materia materia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + materia.getFator());
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "nome='" + nome + '\'' +
                ", materia=" + materia + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}

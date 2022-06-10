public class Area {
    int comprimento, largura, area;

    public void setDim(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getArea() {
        area = comprimento * largura;
        return area;
    }
    
}

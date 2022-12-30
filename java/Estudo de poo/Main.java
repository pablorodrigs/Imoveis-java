import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Imovel> Propriedades = new ArrayList<>();
        int metragemI=0, aux=-1;
        double maxV = 2500, minV = 2000;

        Proprietario p1 = new Proprietario("Ozzy ", "12345678901", "17981354913");
        Imovel       i1 = new Imovel("Rua Visconde de Taunay", 300, 200000.5, p1, "novo");
        Propriedades.add(i1);

        Proprietario p2 = new Proprietario("AXL", "10987654321", "159813720939");
        Imovel       i2 = new Imovel("Eden", 250, 1800000.95, p2, "usado");
        Propriedades.add(i2);

        Proprietario p3 = new Proprietario("Bruce", "19283746501", "11994032715");
        Imovel       i3 = new Imovel("Ibiúna", 400, 1000000.0, p3, "novo");
        Propriedades.add(i3);

        Proprietario p4 = new Proprietario("Kurt", "18394817528", "11992385128");
        Imovel       i4 = new Imovel("Vila Haro", 50, 70000.52, p4, "novo");
        Propriedades.add(i4);

        for(int i=0;i<Propriedades.size();i++)
            if(Propriedades.get(i).getMetragem() > metragemI)
                aux = i;

        System.out.println("O endereço do imóvel que possui a maior metragem é: " + Propriedades.get(aux).getEndereco());

        for(Imovel i : Propriedades)
            if(i.calculaM2() >= minV && i.calculaM2() <= maxV)
                i.PrintIm();
    }
}

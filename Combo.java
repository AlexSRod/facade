public class Combo
{
    public int CdProduto;
    public string Descricao;
    public double Preco;

    public Item(int cdproduto, string descr, double prc)
    {
        CdProduto = cdproduto;
        Descricao = descr;
        Preco = prc;

        public void cdproduto()
        {
            System.out.println("Código do prato escolhido");
        }
        public void descr()
        {
            System.out.println("Dados do prato escolhido");
        }
        public void prc()
        {
            System.out.println("Preço do prato escolhido");
        }
    }
}

public class Venda
{
    public static void main (string args[])
    {
        Combo cmb = new Combo();
        cmb.CdProduto();
        cmb.Descricao();
        cmb.Preco();
    }
}
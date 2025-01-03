package Interface.estabelecimento;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.digitalizadora.Scanner;
import Interface.equipamentos.impressora.DeskJet;
import Interface.equipamentos.impressora.Impressora;
import Interface.equipamentos.impressora.LaserJet;
import Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
            EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em; 

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
    
}

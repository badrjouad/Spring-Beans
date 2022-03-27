package com.albert.springtva;

public class TVAMaroc implements TVA {
    
    @Override
    public double cacluleMontantTva(double montantTva)
    {
        return montantTva*0.20;
    }
}

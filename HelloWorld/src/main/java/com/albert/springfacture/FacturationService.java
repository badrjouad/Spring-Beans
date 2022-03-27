package com.albert.springfacture;


import com.albert.springtva.TVA;

public class FacturationService {

   private TVA t;

   public void setT(TVA t) {
      this.t = t;
   }

   //calcule le montant TVA
   public double cacluleMontantTTC(double montantHT)
   {
       return t.cacluleMontantTva(montantHT)+montantHT;
   }





}

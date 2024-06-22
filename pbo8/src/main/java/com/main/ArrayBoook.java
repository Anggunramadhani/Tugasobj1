package com.main;

public class ArrayBoook {

   public Book[]buku =new Book  [10];

   public Book[] AddBook (Book [] buku) {
      this.buku = buku;
      return buku;
   }

   public void displaybook(){
      for(int i = 0 ; i < buku.length;i ++){
         if(buku [i] != null){
            System.out.print(buku[i].getJudulBuku());

            




         }

      }
   }
}

package ChekingAccout;

    public class CheckingAccount {
        private double saldo;
        private String nama;

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void penarikan(double jumlah) {
            if (saldo < jumlah ) {
                System.out.println("Saldo tidak mencukupi untuk penarikan");
            } else {
                saldo -= jumlah;
                System.out.println("Penarikan berhasil. Saldo baru: " + saldo);
            }
        }
    }

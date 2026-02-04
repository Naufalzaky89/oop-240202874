package main.java.com.upb.agripos.model.pembayaran;

import main.java.com.upb.agripos.model.kontrak.Receiptable;
import main.java.com.upb.agripos.model.kontrak.Validatable;

public class EWallet extends Pembayaran implements Validatable, Receiptable {

    private String provider;

    public EWallet(String invoiceNo, int total, String provider, String string) {
        super(invoiceNo, total); // 🔥 INI WAJIB
        this.provider = provider;
    }

    @Override
    public double biaya() {
        return 2000;
    }

    @Override
    public boolean validasi() {
        return provider != null && !provider.isEmpty();
    }

    @Override
    public boolean prosesPembayaran() {
        return validasi();
    }

    @Override
    public String cetakStruk() {
        return String.format(
            "INVOICE %s | TOTAL+FEE: %.2f | EWALLET: %s | STATUS: %s",
            getInvoiceNo(),
            totalBayar(),
            provider,
            prosesPembayaran() ? "BERHASIL" : "GAGAL"
        );
    }
}

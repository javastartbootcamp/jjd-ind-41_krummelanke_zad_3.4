class SpecialOffer {
    Product product;
    String specialOfferDescription;
    String promoStartDate;
    String promoEndDate;
    double discount;

    SpecialOffer(Product prodDiscounted, String description, String startDate, String endDate, double promoValue) {
        product = prodDiscounted;
        specialOfferDescription = description;
        promoStartDate = startDate;
        promoEndDate = endDate;
        discount = promoValue;
    }

    void printPromoInfo() {

        double newProductPrice = product.price * (1 - discount);
        discount = discount * 100;
        String procent = "%";

        System.out.printf("Promocja dotyczy produktu: %s%nCena wyjściowa: %.2f zł%n%s%n" +
                        "Promocja trwa od: %s do: %s%nRabat: %.0f %s%nCena po rabacie: %.2f zł%n ",
                product.name, product.price, specialOfferDescription, promoStartDate, promoEndDate,
                discount, procent, newProductPrice);

    }
}

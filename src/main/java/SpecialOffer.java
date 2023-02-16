class SpecialOffer {
    Product product;
    String description;
    String promoStartDate;
    String promoEndDate;
    double discount;

    SpecialOffer(Product prodDiscounted, String offerDescription, String startDate, String endDate, double promoValue) {
        product = prodDiscounted;
        description = offerDescription;
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
                product.name, product.price, description, promoStartDate, promoEndDate,
                discount, procent, newProductPrice);

    }
}

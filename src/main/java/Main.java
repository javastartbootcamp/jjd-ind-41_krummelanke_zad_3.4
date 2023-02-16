class Main {
    public static void main(String[] args) {

        //Category category0 = new Category("Brak", "");
        Category category1 = new Category("Małe AGD", "Sprzęt elektroniczny dla domu");
        Category category2 = new Category("Kosmetyki", "Kosmetyki polskie i zagraniczne, w tym koreańskie" +
                " w różnych kategoriach cenowych");

        Product product1 = new Product("Pralka Samsung", 2999, "Pralka 5 kg," +
                " o małym zużyciu prądu, cicha w użytkowaniu, 10 lat gwarancji", category1);
        Product product2 = new Product("Lodówka LG", 2999, "Lodówka 90 litrowa," +
                " o małym zużyciu prądu, cicha w użytkowaniu, 15 lat gwarancji", category1);
        Product product3 = new Product("Szminka Shiseido", 199, "Kolor czerwony", category2);
        Product product4 = new Product("Nóż do warzyw", 75, "Bardzo ostry nóż", null);

        SpecialOffer specialOffer1 = new SpecialOffer(product4, "Oferta tylko przy zakupie jednaj sztuki", "2023-03-01", "2023-03-31", 0.2);

        System.out.printf("%s%n%n", "Informacja o produktach:");
        product1.printProductInfo();
        product2.printProductInfo();
        product3.printProductInfo();
        product4.printProductInfo();
        System.out.printf("%s%n%n", "Informacja o promocji:");
        specialOffer1.printPromoInfo();
    }

}

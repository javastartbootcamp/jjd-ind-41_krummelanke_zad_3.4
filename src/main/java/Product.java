class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String newName, double newPrice, String newDescription, Category cat) {
        name = newName;
        price = newPrice;
        description = newDescription;
        category = cat;
    }

    void printProductInfo() {
        if (category != null) {
            System.out.printf("Produkt: %s%nCena: %.2f zł%nOpis: %s%nKategoria zakupowa: %s - %s%n%n", name, price,
                    description, category.name, category.descrtiption);
        } else {
            System.out.printf("Produkt: %s%nCena: %.2f zł%nOpis: %s%n%n", name, price, description);
        }
    }

}

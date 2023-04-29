class Latte {
  constructor() {
    this.name = "Latte";
  }
}

class Espresso {
  constructor() {
    this.name = "Espresso";
  }
}

class LatteFactory {
  static createCoffee() {
    return new Latte();
  }
}

class EspressoFactory {
  static createCoffee() {
    return new Espresso();
  }
}

const factoryList = { LatteFactory, EspressoFactory };

class CoffeeFactory {
  static createCoffee(type) {
    const factory = factoryList[type];
    return factory.createCoffee();
  }
}

const main = () => {
  //라떼주문
  const coffee = CoffeeFactory.createCoffee("LatteFactory");
  console.log("주문하신 커피는 " + coffee.name + " 입니다.");
};

main();

let Strategy = (function () {
  function Strategy() {
    this.strategy = null;
  }
  Strategy.prototype.setStrategy = function (strategy) {
    this.strategy = strategy;
  };
  Strategy.prototype.execute = function () {
    this.strategy.execute();
  };
  return Strategy;
})();

let ShipStrategy = (function () {
  function ShipStrategy() {}
  ShipStrategy.prototype.execute = function () {
    console.log("Allez en Italie en boite");
  };
  return ShipStrategy;
})();

let LandStrategy = (function () {
  function LandStrategy() {}
  LandStrategy.prototype.execute = function () {
    console.log("Allez en Italie a pied");
  };
  return LandStrategy;
})();

let strat = new Strategy();
let ship = new ShipStrategy();
let land = new LandStrategy();

strat.setStrategy(ship);
strat.setStrategy(land); // 전략 변경
strat.execute();

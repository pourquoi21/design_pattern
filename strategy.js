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

// 전략을 설정하는 부분과 실행하는 부분이 따로 있기 때문에
// 전략 실행 전이라면 언제든지 자유롭게 전략을 바꿀 수 있다.

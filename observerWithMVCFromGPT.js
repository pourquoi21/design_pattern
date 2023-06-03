// class Model {
//   constructor() {
//     this.subscribers = [];
//     this.msg;
//   }

//   publish() {
//     this.msg = "";
//   }

//   register(target) {
//     if (this.subscribers.indexOf(target) < 0) {
//       this.subscribers.push(target);
//     }
//   }

//   postMsg(name, msg) {
//     console.log("New Message from", name, ":", msg);
//     this.msg = msg;
//     for (let i = 0; i < this.subscribers.length; i++) {
//       this.subscribers[i].notify(name, msg);
//     }
//   }
// }

function Model() {
  this.subscribers = [];
  this.msg = "";
}

Model.prototype.publish = function () {
  this.msg = "";
};

Model.prototype.register = function (target) {
  if (this.subscribers.indexOf(target) < 0) {
    this.subscribers.push(target);
  }
};

Model.prototype.postMsg = function (name, msg) {
  console.log("New Message from", name, ":", msg);
  this.msg = msg;
  for (let i = 0; i < this.subscribers.length; i++) {
    this.subscribers[i].notify(name, msg);
  }
};

class View {
  constructor() {
    this.model = new Model();
    this.observers = [];
  }

  subscribe(observer) {
    this.observers.push(observer);
    observer.setModel(this.model);
  }

  render() {
    console.log("Rendering...");
    console.log("Model: ", this.model);
  }
}

class Observer {
  constructor(name) {
    this.name = name;
    this.model;
  }

  setModel(model) {
    this.model = model;
  }

  notify(name, msg) {
    console.log(this.name, "received message from", name, ":", msg);
    this.model.msg = msg;
  }
}

let view = new View();
let observer1 = new Observer("observer1");
let observer2 = new Observer("observer2");

view.subscribe(observer1);
view.subscribe(observer2);

view.model.postMsg("user1", "Hello!");
view.render();

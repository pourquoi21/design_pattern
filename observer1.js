// let Topic = (function () {
//   function Topic() {
//     this.subscribers = [];
//     this.msg;
//   }

//   Topic.prototype.publish = function () {
//     this.msg = "";
//   };
//   Topic.prototype.register = function (target) {
//     if (!this.subscribers.find(target.name) < 0)
//       this.subscribers.push(target.name);
//     return Topic;
//   };
//   Topic.prototype.postMsg = function (name, msg) {
//     console.log("New Message from ", name, +" : " + msg);
//     this.msg = msg;
//   };
// })();

// let Observer = (function () {
//   function Observer() {
//     this.name;
//     this.msg;
//   }
//   Observer.prototype.subscribe = function (name) {
//     this.name = name;
//     target.register(this);
//   };
//   //   Observer.prototype.unsubscribe = function (name) {
//   //     this.list = this.list.filter(function (person) {
//   //       return person.target !== target;
//   //     });
//   //   };
// //   Observer.prototype.fire = function (target) {
// //     console.log(target);
// //   };
//   return Observer;
// })();

class Topic {
  constructor() {
    this.subscribers = [];
    this.msg;
  }

  publish() {
    this.msg = "";
  }

  register(target) {
    if (this.subscribers.indexOf(target) < 0) {
      this.subscribers.push(target);
    }
  }

  postMsg(name, msg) {
    console.log("New Message from", name, ":", msg);
    this.msg = msg;
    for (let i = 0; i < this.subscribers.length; i++) {
      this.subscribers[i].notify(name, msg);
    }
  }
}

class Observer {
  constructor(name) {
    this.name = name;
    this.msg;
  }

  subscribe(topic) {
    topic.register(this);
  }

  notify(name, msg) {
    console.log(this.name, "received message from", name, ":", msg);
    this.msg = msg;
  }
}

let topic = new Topic();
let observer1 = new Observer("observer1");
let observer2 = new Observer("observer2");

observer1.subscribe(topic);
observer2.subscribe(topic);

topic.postMsg("user1", "Hello!");
console.log(observer1, observer2, topic);

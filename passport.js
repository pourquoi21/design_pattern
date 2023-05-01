// 사실 passport 라이브러리의 로직은 정확히 이해가 가지는 않는다.
// Strategy를 이용했다는 거 외에는. JS에서 strategy를 이용하는
// 다른 예시를 찾아보자.
let passport = require("passport"),
  LocalStrategy = require("passport-local").Strategy;

passport.use(
  new LocalStrategy(function (username, password, done) {
    username.findOne({ username: username }, function (err, user) {
      if (err) {
        return done(err);
      }
      if (!user) {
        return done(null, false, { message: "Incorrect username." });
      }
      if (!user.valiePassword(password)) {
        return done(null, false, { message: "Incorrect password." });
      }
      return done(null, user);
    });
  })
);

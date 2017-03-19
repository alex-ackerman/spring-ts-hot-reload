
function range(start, end) {
    return {
        map: function(fn) {
            var res = [];
            for (var i = start; i < end; i++) {
                res.push(fn(i));
            }
            return res;
        }
    }
}


console.log( range(97, 123).map(function(chrCode) { return String.fromCharCode(chrCode); }) )
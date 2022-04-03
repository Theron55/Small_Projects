function countSpaces(s) {
    let result = 0;
    for (let c of s) {
        if (c == " ") {
            result += 1;
        }
    }
    return result;
}

    function oddList(a) {
        let result = [];
        for (let n of a) {
            if (n % 2 == 0) {

            } else {
                result.push(n);
            }
        }
    }

console.log(countSpaces("Hello ther e ever yone"))

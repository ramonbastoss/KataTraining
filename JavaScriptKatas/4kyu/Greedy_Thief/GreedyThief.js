// incomplete kata

function greedyThief(items, n) {
    //coding and coding..
    let itemIsCarriable = false;
    const weights = [];

    for (let item of items) {
        weights.push(item.weight)
        if (item.weight < n)
            itemIsCarriable = true;
    }
    if (!itemIsCarriable) return [];
}


let x = greedyThief([
    { weight: 2, price: 6 },
    { weight: 2, price: 3 },
    { weight: 6, price: 5 },
    { weight: 5, price: 4 },
    { weight: 4, price: 6 }
],
    10,)

let y = greedyThief([
    { weight: 9, price: 1 },
    { weight: 9, price: 2 },
    { weight: 9, price: 3 },
    { weight: 9, price: 4 },
    { weight: 9, price: 5 }
],
    8,)

console.log(x)




// help code
// https://codereview.stackexchange.com/questions/7001/generating-all-combinations-of-an-array
new Vue({
    el:'#app',
    data() {
        return {
            list: [
                {
                    id: 1,
                    name: 'iphone7',
                    price: '6188',
                    count: 1
                },
                {
                    id: 2,
                    name: 'iphone6',
                    price: '4188',
                    count: 2
                },
                {
                    id: 3,
                    name: 'ipad',
                    price: '3000',
                    count: 4
                },
                {
                    id: 4,
                    name: 'mac',
                    price: '16188',
                    count: 1
                },
            ],
        }
    },
    computed: {
        totalPrice:function(){
            var total = 0
            for (const item in this.list) {
                if (this.list.hasOwnProperty(item)) {
                    const element = this.list[item];
                    total += (element.price*element.count)
                }
            }
            return total
        }
    },
    methods: {
        reduce:function(index){
            if(this.list[index].count == 1) return
            this.list[index].count-- 
        },
        plus:function(index){
            this.list[index].count++
        },
        remove:function(index){
            this.list.splice(index,1)
        }

    },
})
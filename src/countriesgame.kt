import kotlin.random.Random

fun main(){
    class country(var name: String, var capital: String){
    fun print(){
        println("The capital of $name is: $capital")
    }}

    var score = 0
    var cclist = ArrayList<country>()
    var col = listOf<String>("Afghanistan","Albania", "Algeria", "Saudi Arabia", "Kuwait", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan")
    var cal = listOf<String>("Kabul","Tirana","Algiers","Riyadh","Kuwait","Buenos Aires","Yerevan","Canberra","Vienna","Baku")
    var check = "Y"
    for (i in 0..9){
    cclist.add(country(col[i],cal[i]))}

    while (check=="Y"&&cclist.size>3) {
        for (i in 0..2) {
            var ran = Random.nextInt((cclist.size)-1)
            print("What is the capital of ${cclist[ran].name}? ")
            if (readLine().toString().lowercase() == cclist[ran].capital.lowercase()) {
                score++
            } else {
                print("Wrong! ")
                cclist[ran].print()
            }
            cclist.removeAt(ran)
        }

        println("Your score is: $score/3")
        print("Play again? Y/N: ")
        check = readLine().toString().uppercase()
    }


}

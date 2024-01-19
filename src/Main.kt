fun generate(numRows: Int): List<List<Int>> {
	val reslist = mutableListOf(mutableListOf(1))
	for(i in 1 until numRows){
		reslist.add(mutableListOf(1))
		for (j in 1 until i+1){
			if(j==i){
				reslist[i].add(1)
			}else{
				reslist[i].add(reslist[i-1][j-1]+reslist[i-1][j])
			}
		}
	}
	return reslist.toList()
}
fun main() {
	println("Hello World!")
	val retList=generate(6)
	println(retList.toString())
}
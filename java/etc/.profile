#cd ./gits/codescraps/java/language
cd ./gits/spring
git config user.name "Billy Murphy"
git config user.email "billy.1.murphy@gmail.com"
alias status='git status'
alias st='git status'
alias s='git status'
alias last='git log -1 HEAD'
alias mcd='mcd' 

mcd(){
mkdir -p $1;
cd $1
}
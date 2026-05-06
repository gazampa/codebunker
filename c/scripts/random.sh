#!/bin/bash
echo running...
# using SRANDOM for better randomness ... > bash5.1
# todo : add unicode to charset to increase complexity, lower compatibility
alnum=( {a..z} {A..Z} {0..9} )
punct=('!' '"' '#' '\' '$' '%' '&' '(' ')' '*' '+' ',' '-' '.' '/' ':' ';' '<' '=' '>' '?' '@' '[' ']' '^' '_' '{' '|' '}' '~' '`' )
unicode=($'\u00A0' $'\u00A9' $'\u00AE' $'\u00B5' $'\u00BF' $'\u00C2' $'\u00FA' $'\u00FB' $'\u1BA8' $'\u1D8AF' $'\u1F60E' $'\u1F606' $'\u1F606' \
          $'\u00A0' $'\u00A9' $'\u10273' $'\u10272' $'\u8907' $'\u8760' $'\u8788' $'\u8781' $'\u8920' $'\u8921' $'\u8810' $'\u8811' $'\u8729' \
          $'\u8743' $'\u8744' $'\u8916'$'\u8764' $'\u8804' $'\u8805'$'\u0C1C' $'\u8951' $'\u8866'$'\uOBED' $'\u035F' $'\u0358' )
chars=( "${alnum[@]}" "${punct[@]}" "${unicode[@]}")
result=()
sz=${#chars[@]}
echo $sz
printf '%s' "${chars[@]}";echo
for (( i=0; i<${#chars[@]}; i++ )); do
    #char="${str:$i:1}"
    result+="${chars[$((SRANDOM%sz))]}" # big numerator over denominator to reduce modulo bias and 2^32 / 2^7 for better division performance.
done
printf '%s ' "${result[@]}";

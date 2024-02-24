#include <string>
#include <vector>
#include <map>
using namespace std;

string solution(string letter) {
    string answer = "";
    map<string, char> mos;
    mos.insert({".-", 'a'});
    mos.insert({"-...", 'b'});
    mos.insert({"-.-.", 'c'});
    mos.insert({"-..", 'd'});
    mos.insert({".", 'e'});
    mos.insert({"..-.", 'f'});
    mos.insert({"--.", 'g'});
    mos.insert({"....", 'h'});
    mos.insert({"..", 'i'});
    mos.insert({".---", 'j'});
    mos.insert({"-.-", 'k'});
    mos.insert({".-..", 'l'});
    mos.insert({"--", 'm'});
    mos.insert({"-.", 'n'});
    mos.insert({"---", 'o'});
    mos.insert({".--.", 'p'});
    mos.insert({"--.-", 'q'});
    mos.insert({".-.", 'r'});
    mos.insert({"...", 's'});
    mos.insert({"-", 't'});
    mos.insert({"..-", 'u'});
    mos.insert({"...-", 'v'});
    mos.insert({".--", 'w'});
    mos.insert({"-..-", 'x'});
    mos.insert({"-.--", 'y'});
    mos.insert({"--..", 'z'});

    string morse = "";
    for (char c : letter) {
        if (c == ' ') {
            answer += mos[morse];
            morse = "";
        } else {
            morse += c;
        }
    }
    if (!morse.empty()) {
        answer += mos[morse];
    }
    return answer;
}

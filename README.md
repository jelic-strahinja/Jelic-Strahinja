Pozdrav, ovde pisem uputsvo kao sto ste i rekli kako se ranuje kod.

Pisan je u javi/selenium/chrome webdriver + citanje iz excel-a;

Posto je na sajtu pisalo da koristim kredencijale pomocu kojih sam napravio account, ja sam u 
berofe metodu stavio logovanje pre svakog testa (mozda je cak i bolja opcija bila da addujem cookie, i da ne mora log, ali je onako pisalo u testu);
Kredencijale citam iz eksela;

Prvi test testira
-Da 'Title' field nece baciti error message sa donjom granicom od 5 karaktera
-Da 'Description' nece baciti error ako je prazno polje
-Da ce 'Expected resault'  baciti error sa 4 karaktera (5 je donja granica)
-Da ako 'YES/NO' Button moze da ostane na NO
-Da 'Use case step 1' moze da ima samo jedan znak, i da use case moze(mora) da ima samo jedan step
-assertovanje da se error poruka pojavila
-promena 'Expected resault'-a na 5 karaktera
-zatim klikcem na submit dugme i assertujem da se use case kreirao

Drugi test
-da

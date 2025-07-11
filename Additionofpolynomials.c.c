#include <stdio.h>
#define max_term 100

struct poly{
        int coeff;
        int expo;
}term[max_term]; 

int f = 0;

// COMPARE FUNCTION //
int compare(int a, int b) {
    if (a == b) return '=';
    else if (a < b) return '<';
    else return '>';
}

// APPEND THE ARRAY //
void newterm(int coeff, int expo) {
    if(f >= max_term){
        printf("No enough space!");
    }
    term[f].coeff = coeff;
    term[f].expo = expo;
    f++;
}
// ADD FUNCTION // 
void add(int af, int al, int bf, int bl) {
    int p = af;
    int q = bf;
    int c;

    while (p <= al && q <= bl) {
        switch (compare(term[p].expo, term[q].expo)) {
            case '=':
                c = term[p].coeff + term[q].coeff;
                if (c != 0)
                    newterm(c, term[p].expo);
                p++;
                q++;
                break;

            case '<':  // B has higher exponent
                newterm(term[q].coeff, term[q].expo);
                q++;
                break;

            case '>':  // A has higher exponent
                newterm(term[p].coeff, term[p].expo);
                p++;
                break;
        }
    }

    while (p <= al) {
        newterm(term[p].coeff, term[p].expo);
        p++;
    }

    while (q <= bl) {
        newterm(term[q].coeff, term[q].expo);
        q++;
    }
}

// MAIN FUNCTION //
void main()
{
    int na, i, coeff, expo, nb,j, m; 

    printf("Enter the number of terms in polynomial (A): ");
    scanf("%d", &na);

    printf("\n");

    for(i = 0; i<na; i++){
        printf("Enter coefficient of %d term: ", i+1);
        scanf("%d", &term[i].coeff);

        printf("Enter the exponent of the %d term: ", i+1);
        scanf("%d", &term[i].expo); 
    }
    printf("\n");

    printf("Enter the number of terms in polynomial (B): ");
    scanf("%d", &nb);

    int k = na+nb; 

    for(j = na; j<k; j++){
        printf("Enter coefficient of %d term: ",  j - na + 1);
        scanf("%d", &term[j].coeff);

        printf("Enter the exponent of the %d term: ",   j - na + 1);
        scanf("%d", &term[j].expo); 
    }

    printf("\n"); 

    printf("The first polynomial is: ");
    for(i = 0; i<na; i++){
        printf("%dx^%d", term[i].coeff, term[i].expo);
        if(i< na - 1){
              printf("+"); 
        }
    }
    printf("\n"); 

     printf("The second polynomial is: ");
    for(j = na; j<k; j++){
        printf("%dx^%d", term[j].coeff, term[j].expo);
        if(j< k-1){
              printf("+"); 
        }
    } 

    f = na + nb;
    add(0, na - 1, na, na + nb - 1); 

    printf("\nResultant Polynomial after Addition: ");
    for( m = na+nb ; m < f; m++) {
        printf("%dx^%d", term[m].coeff, term[m].expo);
        if(m < f - 1)
            printf(" + ");
    }

}// void







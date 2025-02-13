#include <iostream>
using namespace std;

const int MAX = 1025; // 문제 조건에서 최대 1024x1024 크기
int dp[MAX][MAX];

int main() {
    ios::sync_with_stdio(false); 
    cin.tie(0);
    
    int n, q;
    cin >> n >> q;
    
    // 배열 입력 및 누적 합 계산
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            int num;
            cin >> num;
            dp[i][j] = num + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
        }
    }

    // 쿼리 처리
    while (q--) {
        int x1, y1, x2, y2;
        cin >> x1 >> y1 >> x2 >> y2;
        cout << dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1] << '\n';
    }
    
    return 0;
}

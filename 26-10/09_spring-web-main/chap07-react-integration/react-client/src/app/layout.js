import "./globals.css";

export const metadata = {
  title: "Spring Next.js 연동",
  description: "Spring Boot REST API와 Next.js 연동 실습",
};

export default function RootLayout({ children }) {
  return (
    <html lang="ko">
      <body>{children}</body>
    </html>
  );
}

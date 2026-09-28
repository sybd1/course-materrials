'use client'

import { postApi } from "@/api/postApi";
import { useEffect, useState } from "react";

export default function CRUDPage() {
    const [posts, setPosts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);


    const loadPosts = async () => {
        try {
            setLoading(true);
            setError(null);

            const data = await postApi.getPosts();
            setPosts(data);

        } catch (error) {
            setError(error.message);
        } finally {
            setLoading(false);
        }
    }

    const handleAdd = async () => {
        try {
            setError(null);

            await postApi.createPost({
                title: "새로운 게시글" + Date.now(),
                author: "익룡"
            });

            await loadPosts();

        } catch (error) {
            setError(error.message);
        }
    }

    const handleUpdate = async (id) => {
        try {
            setError(null);

            await postApi.updatePost(id, "수정된 게시글 제목");
            await loadPosts();

        } catch (error) {
            setError(error.message);
        }
    }

    const handleDelete = async (id) => {
        const shouldDelete = window.confirm("정말 삭제하시렵니까?");

        if (!shouldDelete) return;

        try {
            setError(null);
            await postApi.deletePost(id);
            await loadPosts();
        } catch (error) {
            setError(error.message);
        }
    }

    useEffect(() => {
        loadPosts();
    }, []);

    if (loading) return <p>게시글 불러오는 중...</p>;
    if (error) return <p>오류: {error}</p>;

    return (
        <>
            <h1>게시글 관리</h1>
            <button onClick={handleAdd}>새 글 등록</button>
            {posts.map((post) => (
                <div key={post.id}>
                    <h3>{post.title}</h3>
                    <p>작성자: {post.author}</p>
                    <button onClick={() => handleUpdate(post.id)}>제목 수정</button> <br/>
                    <button onClick={() => handleDelete(post.id)}>삭제</button>
                </div>
            ))}
        </>
    )
}
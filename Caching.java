Sure! Let’s dive into **caching** in **system design** clearly.

---

### **1. Definition**

**Caching** is a technique to **store frequently accessed data in a fast storage layer** so that future requests for that data can be served **quickly** without repeatedly querying the **slower backend/database**.

* The stored data is called a **cache**.
* Goal: Reduce **latency**, **improve performance**, and **decrease load** on the main system.

---

### **2. Why We Need Caching**

1. **Faster response times** – Users get data from cache instead of waiting for database queries.
2. **Reduced database load** – Fewer expensive database reads.
3. **Better scalability** – Supports higher traffic without increasing database capacity.
4. **Cost savings** – Less compute resource usage on backend servers.

---

### **3. Types of Caching**

**A. Based on Location**

1. **Client-side cache**

   * Stored in the user’s browser or app.
   * Example: Browser caching images, HTML, JS files.

2. **Server-side cache**

   * Stored on the server or a caching layer.
   * Example: Redis or Memcached caching database query results.

3. **CDN cache**

   * Stored at edge locations of a **Content Delivery Network**.
   * Example: Images, videos, CSS, JS cached close to users globally.

---

**B. Based on Data**

1. **Database Caching** – Caches query results.
2. **Page Caching** – Caches full HTML pages.
3. **Object Caching** – Caches objects or responses in memory.
4. **Application Caching** – Specific to app logic (e.g., session data, API responses).

---

### **4. Cache Strategies**

1. **Write-through cache**

   * Data is written to cache **and database simultaneously**.
   * Pros: Consistency maintained.
   * Cons: Slightly slower writes.

2. **Write-back (write-behind) cache**

   * Data is written to cache **first**, then asynchronously updated in database.
   * Pros: Fast writes.
   * Cons: Risk of data loss if cache fails.

3. **Cache-aside (Lazy loading)**

   * Application **checks cache first**. If not found, fetch from DB and populate cache.
   * Pros: Efficient memory usage.
   * Cons: Slightly more complex logic.

---

### **5. Cache Eviction Policies**

Since cache storage is limited, we need rules for removing old items:

1. **LRU (Least Recently Used)** – Remove the least recently accessed item.
2. **LFU (Least Frequently Used)** – Remove the least frequently accessed item.
3. **TTL (Time to Live)** – Remove items after a certain time.

---

### **6. Tools for Caching**

* **In-memory caching**: Redis, Memcached
* **CDN caching**: Cloudflare, Akamai
* **Browser caching**: HTTP headers (`Cache-Control`)

---

### **7. Example**

Imagine a social media feed:

* **Without cache**: Every user request queries the database → slow.
* **With cache**: Popular feeds are cached in Redis → served instantly → DB load reduced.

---

✅ **In short:**
Caching is like **keeping a shortcut to frequently used data**. Instead of going through a long path every time (database queries), you use a **fast-access memory** to improve speed and scalability.

---

If you want, I can **draw a diagram showing caching in system design with database, cache, and users**. It makes the concept super clear.

Do you want me to do that?
